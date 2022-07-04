package com.example.easetudy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.se.omapi.Session;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
//import com.google.api.Backend;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

public class login extends AppCompatActivity {
    private EditText mEmail, mPassword;
    private Button   mLoginBtn;
    private TextView mCreateBtn;

//    private FirebaseAuth fAuth;

    FirebaseAuth mAuth;

//    SharedPreferences sharedPreferences; old
//
//    public  static final String fileName="Login";
//    public  static final String Username="email"; old
//    public  static final String Password="password";

    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME="mypref";
    private static final String KEY_EMAIL ="email";
    private static final String KEY_PASSWORD ="password";

    // Google sign in old //
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    // Google sign in old //

    ImageView googlebtn,facebookbtn;
    TextView name_signinwith, email_signinwith;

    CallbackManager callbackManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        callbackManager = CallbackManager.Factory.create();

//        AccessToken accessToken = AccessToken.getCurrentAccessTokezn(); FACEBOOK SIGN UP
//        if (accessToken!=null && accessToken.isExpired()==false){
//            startActivity(new Intent(login.this,MainActivity.class));
//            finish();
//        }



//        LoginManager.getInstance().registerCallback(callbackManager, FACEBOOK SIGN UP
//                new FacebookCallback<LoginResult>() {
//                    @Override
//                    public void onSuccess(LoginResult loginResult) {
//                        startActivity(new Intent(login.this,MainActivity.class));
//                        finish();
//
//                    }
//
//                    @Override
//                    public void onCancel() {
//                        // App code
//                    }
//
//                    @Override
//                    public void onError(FacebookException exception) {
//                        // App code
//                    }
//                });


//                // Google sign in old //
//        name_signinwith = findViewById(R.id.name_signinwith);
//        email_signinwith = findViewById(R.id.email_signinwith);
//
//        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
//        if (acct != null){
//            String personName = acct.getDisplayName();
//            String personEmail = acct.getEmail();
//            name_signinwith.setText(personName);
//            email_signinwith.setText(personEmail);
//        }     // Google sign in old //

        facebookbtn = findViewById(R.id.fb_btn);
        googlebtn = findViewById(R.id.google_btn);


                 // Google sign in old //
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this,gso);



    facebookbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(login.this,FacebookAuthActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(intent);


//            LoginManager.getInstance().logInWithReadPermissions(login.this, Arrays.asList("public_profile"));
        }
    });

    // FACEBOOK SIGN UP
//        GraphRequest request = GraphRequest.newMeRequest(
//                accessToken,
//                new GraphRequest.GraphJSONObjectCallback() {
//                    @Override
//                    public void onCompleted(
//                            JSONObject object,
//                            GraphResponse response) {
//
//                        try {
//                            String fullName = object.getString("name");
//                            name_signinwith.setText(fullName);
//
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                        // Application code
//                    }
//                });
//        Bundle parameters = new Bundle();
//        parameters.putString("fields", "id,name,link");
//        request.setParameters(parameters);
//        request.executeAsync();
// FACEBOOK SIGN UP

        googlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });       // Google sign in old //

        mAuth=FirebaseAuth.getInstance();

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        String email = sharedPreferences.getString(KEY_EMAIL,null);

        if (email != null){
            Intent intent = new Intent(login.this,MainActivity.class);
            startActivity(intent);
        }


        /* session sharedreference */
//        User user = new User(12,"jjj");
//
//        //1. login and save session
//        SessionManagement sessionManagement = new SessionManagement(Login.this);
//        sessionManagement.saveSession(user);
//
//        //2. step
//        moveToMainActivity();
        /* session sharedreference */



//        sharedPreferences = getSharedPreferences(fileName, Context.MODE_PRIVATE);
//        if (sharedPreferences.contains(Username)){
//            Intent i = new Intent(Login.this,MainActivity.class);         OLD
//            startActivity(i);
//        }



        mEmail      = (EditText)    findViewById(R.id.Email);
        mPassword   = (EditText)    findViewById(R.id.password);

        mLoginBtn   = (Button)      findViewById(R.id.loginBtn);
        mCreateBtn  = (TextView)    findViewById(R.id.createText);

//        fAuth = FirebaseAuth.getInstance();

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //when click a button put data on shared preference..
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_EMAIL,mEmail.getText().toString());
                editor.putString(KEY_PASSWORD,mPassword.getText().toString());
                editor.apply();


                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();


                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email is required");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Password is required");
                    return;
                }

                if(password.length()<8){
                    mPassword.setError("Password must be at least 8 numbers");
                    return;
                }
//                SharedPreferences.Editor editor =sharedPreferences.edit();
//                editor.putString(Username,email);
//                editor.commit(); old


                // authenticate the user

                mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(login.this,"Logged in successfully", Toast.LENGTH_LONG).show();
//                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(login.this,"Error ! " + task.getException().getMessage(),Toast.LENGTH_LONG).show();
                            mEmail.setText("");
                            mEmail.requestFocus();
                            mPassword.setText("");
                        }

                    }
                });
            }
        });




        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),register.class));
            }
        });


    }



    // Google sign in old //
    void signIn(){
        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent,1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

            try {
                task.getResult(ApiException.class);
                navigateToMainActivity();
            } catch (ApiException e) {
                Toast.makeText(getApplicationContext(), "something went wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }


//    @Override         FB SIGN UP
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        callbackManager.onActivityResult(requestCode, resultCode, data);
//        super.onActivityResult(requestCode, resultCode, data);
//    }



    void navigateToMainActivity(){
        finish();
        Intent intent = new Intent(login.this,MainActivity.class);
        startActivity(intent);
    }
    // Google sign in old //




    /* session sharedreference */
//    private void moveToMainActivity() {
//        Intent intent = new Intent(Login.this,MainActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(intent);
//    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        checkSession();
//
//    }
//
//    private void checkSession() {
//        //check if user is logged in
//        //if user is logged in --> move to mainactivity
//
//        SessionManagement sessionManagement = new SessionManagement(Login.this);
//        int userID = sessionManagement.getSession();
//
//        if (userID != -1){
//            //user id logged in and move to mainactivity
//            moveToMainActivity();
//        }else{
//            //do nothing
//        }
//    } /* session sharedreference */





}