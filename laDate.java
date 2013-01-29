import android.app.activity;
import android.os.bundle;
import android.view.View;
import android widget.Button;
import java.util.Date;

public class LaDate extends activity implements View.onClickListener{
		Button unBouton;
		@Override
		public void onCreat(Bundle b){
			super.onCreat(b);
			setContentView(R.layout.main)
			unBouton = (button)findViewById(R.id.bouton);
			unBouton.SetOnClickListener(this);
			updateTime();
		}

	public void onClick(View view){
		updateTime();
	}
	private void updateTime(){
		unBouton.setText(new Date().toString());
	}
}