package bistu.rookie.u_nity.androidproject_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.Button);
        final TextView editView = (TextView) findViewById(R.id.TextView1);
        final TextView checkView = (TextView) findViewById(R.id.TextView2);
        final TextView radioView = (TextView) findViewById(R.id.TextView3);
        final EditText edit = (EditText) findViewById(R.id.EditText);
        CheckBox checkA = (CheckBox) findViewById(R.id.CheckA);
        CheckBox checkB = (CheckBox) findViewById(R.id.CheckB);
        RadioButton radioX = (RadioButton) findViewById(R.id.RadioX);
        RadioButton radioY = (RadioButton) findViewById(R.id.RadioY);

        checkA.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    checkView.setText("A");
                else
                    checkView.setText("");
            }
        });

        checkB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    checkView.setText("B");
                else
                    checkView.setText("");
            }
        });

        radioX.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    radioView.setText("X");
            }
        });

        radioY.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    radioView.setText("Y");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable text = edit.getEditableText();
                edit.setHint(text);
                editView.setText("Edit Success");
            }
        });
    }

}
