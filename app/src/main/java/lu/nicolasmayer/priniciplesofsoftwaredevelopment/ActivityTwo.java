package lu.nicolasmayer.priniciplesofsoftwaredevelopment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Nic on 05/10/16.
 */
public class ActivityTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two);



        Intent intent = getIntent();

        int result = intent.getIntExtra("Result", 0);


        TextView textView = (TextView) findViewById(R.id.textViewResult);

        textView.setText(""+ result);



    }
}
