package com.example.a2yg.snsproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}


//        try {
//                PackageInfo info = getPackageManager().getPackageInfo("com.example.a2yg.snsproject", PackageManager.GET_SIGNATURES);
//                for (Signature signature : info.signatures) {
//                MessageDigest md = MessageDigest.getInstance("SHA");
//                md.update(signature.toByteArray());
//                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
//                }
//                } catch (PackageManager.NameNotFoundException e) {
//                e.printStackTrace();
//                } catch (NoSuchAlgorithmException e) {
//                e.printStackTrace();
//                }