package arthez.polygonprogressviewsexamples;

import arthur.hexagonprogressanimation.PolygonProgressBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfoTextView = (TextView) findViewById(R.id.infoTextView);
    }

    public void onClickInfoButton(View v) {
        if(mInfoTextView.getVisibility() == View.GONE) {
            mInfoTextView.setVisibility(View.VISIBLE);
        } else {
            mInfoTextView.setVisibility(View.GONE);
        }
    }

    public void onClickPolygonProgressBar(View v) {
        PolygonProgressBar polygonProgressBarExample;
        polygonProgressBarExample = (PolygonProgressBar) findViewById(v.getId());
        polygonProgressBarExample.toggleAnimation();
    }
}
