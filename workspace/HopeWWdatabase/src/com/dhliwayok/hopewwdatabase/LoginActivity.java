package com.dhliwayok.hopewwdatabase;


import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class LoginActivity extends Activity {
	Button btnLogin;
	Button btnLinkToRegister;
	EditText username;
	EditText password;
	TextView loginErrorMsg;
	HopeDbAdapter mydb;

	// JSON Response node names
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		// Importing all assets like buttons, text fields
		username = (EditText) findViewById(R.id.loginEmail);
		password = (EditText) findViewById(R.id.loginPassword);
		btnLogin = (Button) findViewById(R.id.btnLogin);
		loginErrorMsg = (TextView) findViewById(R.id.login_error);
		mydb = new HopeDbAdapter(this);

		// Login button Click Event
		btnLogin.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				String usename = username.getText().toString();
				String passWord = password.getText().toString();
				//UserFunctions userFunction = new UserFunctions();
				Log.d("Button", "Login");

				if (username.length() > 0 && password.length() > 0) {
					try {

						if (mydb.Login(usename, passWord)) {
							Message.message(LoginActivity.this, "Successfully Logged In");
						} else {
							Message.message(LoginActivity.this,"Invalid username or password");
					}

					} catch (Exception e) {
						Message.message(LoginActivity.this,"Some problem occurred"+e); 
					}
				} else {
					Message.message(LoginActivity.this,"Username or Password is empty");
					//JSONObject json = userFunction.loginUser(email, password);

					// check for login response
				}
			}

		});

	}		// Link to Register Screen
}

