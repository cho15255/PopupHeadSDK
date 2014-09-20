package sc.popupheadframework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TempActivity extends Activity {

    private Button enableToggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        enableToggleButton = (Button)findViewById(R.id.button);
        enableToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addHeadView();
            }
        });
    }

    private void addHeadView() {

    }
}
