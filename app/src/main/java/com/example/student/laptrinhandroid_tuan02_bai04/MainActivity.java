package com.example.student.laptrinhandroid_tuan02_bai04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_HoTen, et_CMND, et_ThongTinBoSung;
    private RadioGroup radiogroup_BangCap;
    private RadioButton radiobt_TrungCap, radiobt_CaoDang, radiobt_DaiHoc;
    private CheckBox cb_DocBao, cb_DocSach, cb_DocCoding;
    private Button bt_GuiThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        XuLy();
    }

    public void AnhXa() {
        et_HoTen = (EditText) findViewById(R.id.et_HoTen);
        et_CMND = (EditText) findViewById(R.id.et_CMND);
        et_ThongTinBoSung = (EditText) findViewById(R.id.et_ThongTinBoSung);

        radiogroup_BangCap = (RadioGroup) findViewById(R.id.radiogroup_BangCap);

        radiobt_TrungCap = (RadioButton) findViewById(R.id.radiobt_TrungCap);
        radiobt_CaoDang = (RadioButton) findViewById(R.id.radiobt_CaoDang);
        radiobt_DaiHoc = (RadioButton) findViewById(R.id.radiobt_DaiHoc);

        cb_DocBao = (CheckBox) findViewById(R.id.cb_DocBao);
        cb_DocSach = (CheckBox) findViewById(R.id.cb_DocSach);
        cb_DocCoding = (CheckBox) findViewById(R.id.cb_DocCoding);
        
        bt_GuiThongTin = (Button) findViewById(R.id.bt_GuiThongTin);
    }

    public void XuLy() {
        bt_GuiThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_HoTen.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Họ tên không để trống", Toast.LENGTH_SHORT).show();
                } else if (et_HoTen.getText().toString().length() < 3) {
                    Toast.makeText(MainActivity.this, "Họ tên có ít nhất 3 ký tự", Toast.LENGTH_SHORT).show();
                } else if (et_CMND.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "CMND không để trống", Toast.LENGTH_SHORT).show();
                } else if (et_CMND.getText().toString().length() > 9) {
                    Toast.makeText(MainActivity.this, "CMND đúng 9 chữ số", Toast.LENGTH_SHORT).show();
                } else if (et_CMND.getText().toString().length() < 9) {
                    Toast.makeText(MainActivity.this, "CMND đúng 9 chữ số", Toast.LENGTH_SHORT).show();
                } else if (!cb_DocBao.isChecked() && !cb_DocSach.isChecked() && !cb_DocCoding.isChecked()) {
                    Toast.makeText(MainActivity.this, "Chọn ít nhất 1 sở thích", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
