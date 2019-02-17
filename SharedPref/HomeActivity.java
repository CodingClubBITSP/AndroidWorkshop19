import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView textView ;
    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Gets a reference to the shared preference to see the saved email and password
        final SharedPreferences sharedPreferences = getSharedPreferences("LoginDetails",this.MODE_PRIVATE);

        //After fetching the email, it stores it in String variable
        String email= sharedPreferences.getString("Email",null);

        //Finds a reference to the TextView so that the email can be displayed onto the screen
        textView = findViewById(R.id.textview);

        //Finds a reference to the logout button so that the user can log out of the application
        logout = findViewById(R.id.logout);

        //Checks if the email was saved in the phone
        if(email!=null)
        textView.setText("WELCOME "+email);
        else {
            //the email was not saved which means the user did not check the 'Remember Me' checkbox
            textView.setText("WELCOME " + getIntent().getExtras().getString("Email"));
        }
        }

        //defines what happens when the user clicks the logout button
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             SharedPreferences.Editor editor =   sharedPreferences.edit();
             editor.clear();
             //clears out the user data of the application
             editor.commit();
             //takes the user back into the login page
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });
    }
}