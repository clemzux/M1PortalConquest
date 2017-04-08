package univtln.fr.projetdapm.colorprogress;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Drawable drawable;
        ProgressBar progressBar = (ProgressBar)findViewById(R.id.pb);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            drawable = this.getResources().getDrawable(R.drawable.progress_bar_blue,null);
        }
        else
            drawable = this.getResources().getDrawable(R.drawable.progress_bar_blue);

        //progressBar.setProgressDrawable(drawable);

        progressBar.setProgress(40);
    }


}
