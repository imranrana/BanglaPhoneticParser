package jhalmuri.imranrana.banglaphoneticparser;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
TextView txtViewBangla;
    EditText editTxtEnglish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtViewBangla = (TextView) findViewById(R.id.banglaTextView);
        editTxtEnglish = (EditText) findViewById(R.id.englishEditText);

        editTxtEnglish.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.equals("")) {
                    String result = BanglaPhoneticParser.parse(s.toString());
                    txtViewBangla.setText(result);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




    }

}
