package codepath.com.instalogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView view = (TextView) findViewById(R.id.textView2);
        String text = "Don't have an account? <b>Sign up</b>";
        view.setText(Html.fromHtml(text));
    }
}
