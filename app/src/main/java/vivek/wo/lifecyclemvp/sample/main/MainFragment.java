package vivek.wo.lifecyclemvp.sample.main;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */

public class MainFragment extends Fragment implements MainFragmentContact.View {

    @Inject
    MainFragmentPresenter mainFragmentPresenter;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        FrameLayout layout = new FrameLayout(getContext());
        layout.setBackgroundColor(Color.BLUE);
        return layout;
    }
}
