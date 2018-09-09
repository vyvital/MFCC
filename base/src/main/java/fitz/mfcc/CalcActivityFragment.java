package fitz.mfcc;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class CalcActivityFragment extends Fragment {

    public CalcActivityFragment() {
    }

    public static CalcActivityFragment newInstance() {
        return new CalcActivityFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calc, container, false);
    }
}
