package com.example.easetudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private CheckBox ch1;
    private Button btnSubmit;

    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME="mypref";
    private static final String KEY_EMAIL ="email";
    private static final String KEY_PASSWORD ="password";

    // Google sign in old //
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    TextView name_signinwith, email_signinwith;
    // Google sign in old //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnSubmit = findViewById(R.id.btn_submit);


        // Google sign in old //
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this,gso);
        // Google sign in old //

        // Google sign in old //
        name_signinwith = findViewById(R.id.name_signinwith);
        email_signinwith = findViewById(R.id.email_signinwith);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null){
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();
            name_signinwith.setText(personName);
            email_signinwith.setText(personEmail);
        }     // Google sign in old //


        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        String email = sharedPreferences.getString(KEY_EMAIL, null);
        String password = sharedPreferences.getString(KEY_PASSWORD, null);

      ch1 = findViewById(R.id.ch1);
//      btnSubmit = findViewById(R.id.btn_submit);

        AccessToken accessToken = AccessToken.getCurrentAccessToken();

//         FACEBOOK SIGN UP
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

      btnSubmit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              if (ch1.isChecked()) {
                  Toast.makeText(MainActivity.this, "Accepted", Toast.LENGTH_LONG).show();
                  Intent intent = new Intent(getApplicationContext(), page1.class);
                  startActivity(intent);
              }else {
                  Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
              }


//              if (ch1 != null) {
//                  Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
//              }
          }


      });
    }
}