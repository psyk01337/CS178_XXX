package sarral.mangubatc.act01;

import java.util.List;

import com.example.db1.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class ContactsSpinnerAdapater extends BaseAdapter implements
		SpinnerAdapter {
	private final List<SpinnerEntry> content;
	private final Activity activity;

	public ContactsSpinnerAdapater(List<SpinnerEntry> content,
			Activity activity) {
		super();
		this.content = content;
		this.activity = activity;
	}

	public int getCount() {
		return content.size();
	}

	public SpinnerEntry getItem(int position) {
		return content.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView,
			ViewGroup parent) {
		final LayoutInflater inflater = activity.getLayoutInflater();	// default layout inflater
		final View spinnerEntry = inflater.inflate(
				R.layout.spinner_exp, null);				// initialize the layout from xml
		final TextView contactName = (TextView) spinnerEntry
				.findViewById(R.id.spinnerEntryContactName);
		
		final SpinnerEntry currentEntry = content.get(position);	
		contactName.setText(currentEntry.getContactName());
		
		return spinnerEntry;
	}

}
