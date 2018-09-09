package fitz.mfcc.calc;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class CalcFragment extends Fragment {

    Button calc;
    public static final String TAG = CalcFragment.class.getSimpleName();

    public CalcFragment() {
        // Required empty public constructor
    }

    public static CalcFragment newInstance() {
        return new CalcFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calc, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        calc = view.findViewById(R.id.calculate);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setTransitionName("yoyoyo");
                getFragmentManager()
                        .beginTransaction()
                        .addSharedElement(calc, ViewCompat.getTransitionName(calc))
                        .addToBackStack(TAG)
                        .replace(R.id.content, ResFragment.newInstance())
                        .commit();
            }
        });




    }
}
