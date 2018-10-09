package io.github.hendrawd.beyondthekotlinbasics.material;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import io.github.hendrawd.beyondthekotlinbasics.R;
import io.github.hendrawd.beyondthekotlinbasics.common.ExtKt;

/**
 * @author hendrawd on 30 Sep 2018
 */
public class CallingExtensionFunctionFromJava extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewProfilePhoto = findViewById(R.id.ivProfilePhoto);
        String imageUrl = "https://avatars2.githubusercontent.com/u/9481791";
        ExtKt.glideLoad(imageViewProfilePhoto, imageUrl);

        array(new String[]{"string1", "string2", "string3"});
        varargs("string1", "string2", "string3");
    }

    private void array(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private void varargs(String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void main(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
