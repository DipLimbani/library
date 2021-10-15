package lyrical.ly.jitpackdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    import lyrical.ly.jitpacktest.ToolBarAnimation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar =  findViewById(R.id.tool_bar);
        Button buttonUp = findViewById(R.id.btn_up);
        buttonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToolBarAnimation.tranAnimationUp(MainActivity.this, toolbar);
            }
        });

        Button buttonDown = findViewById(R.id.btn_down);
        buttonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToolBarAnimation.tranAnimationDown(MainActivity.this, toolbar);
            }
        });
    }
}