package tech.cintech.www.mucin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnShowMsgClicked(View view) {
        try {
            EditText objEdit = (EditText) this.findViewById(R.id.txtHelloWorld);
            String strText = objEdit.getText().toString();

            new AlertDialog.Builder(this).setTitle("多选框")
                    .setMessage(strText)
                    .setPositiveButton("确定", null)
                    .setNegativeButton("取消", null)
                    .show();
        } catch (Exception err) {
            new AlertDialog.Builder(this).setTitle("Error!")
                    .setMessage(err.getMessage())
                    .setPositiveButton("确定", null)
                    .show();
        }
    }
}