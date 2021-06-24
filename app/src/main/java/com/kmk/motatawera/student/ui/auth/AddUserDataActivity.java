package com.kmk.motatawera.student.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.kmk.motatawera.student.R;
import com.kmk.motatawera.student.databinding.ActivityAddUserDataBinding;
import com.kmk.motatawera.student.model.StudentModel;

import java.util.HashMap;
import java.util.Map;

public class AddUserDataActivity extends AppCompatActivity {

    private ActivityAddUserDataBinding binding;
    private String phone, email, name, password, confirm_password;

    FirebaseFirestore firestore;
    String id;
    StudentModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_user_data);
        firestore = FirebaseFirestore.getInstance();
        id= getIntent().getStringExtra("id");

        binding.btnSave.setOnClickListener(v -> {

            validationData();

        });
    }

    private void validationData() {
        email = binding.email.getText().toString().trim();
        phone = binding.phone.getText().toString().trim();
        name = binding.name.getText().toString().trim();
        password = binding.newPassword.getText().toString().trim();
        confirm_password = binding.confirmNewPassword.getText().toString().trim();



        if (email.isEmpty()) {
            binding.email.requestFocus();
            showAlert("Email is required");

        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.email.requestFocus();
            showAlert("Invaild Emaill address\nEmail must be yourName@company.com");
        }
        if (!password.equals(confirm_password)) {
            showAlert("password not equal confirm password");
        }
        if (name.isEmpty()) {
            binding.name.requestFocus();
            showAlert("name is required");
            return;
        }
        if (phone.isEmpty()) {
            binding.phone.requestFocus();
            showAlert("phone is required");
            return;
        }
        if (phone.length() < 11) {
            binding.phone.requestFocus();
            showAlert("invalid phone required");
            return;
        }
        savewithfirebase();
    }

    private void savewithfirebase() {


        DocumentReference mm = firestore.collection("student").document(id);
        Map<String, Object> user = new HashMap<>();

        user.put("password", password);
        user.put("email", email);
        user.put("name", name);
        user.put("phone", phone);

        mm.update(user).addOnCompleteListener(task -> {

            Toast.makeText(this, "DataAdded", Toast.LENGTH_SHORT).show();

          //  SharedPrefManager.getInstance().saveUser(this, documentChange.getDocument().toObject(UserModel.class));
            goToLogin();

        });


    }

    private void goToLogin() {
        startActivity(new Intent(AddUserDataActivity.this, LoginActivity.class));
        finish();
    }


    void showAlert(String msg) {
        new AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage(msg)
                .setPositiveButton("OK", null)
                .create().show();
    }

}