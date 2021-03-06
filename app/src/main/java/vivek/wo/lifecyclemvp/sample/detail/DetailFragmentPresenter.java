package vivek.wo.lifecyclemvp.sample.detail;

import android.content.SharedPreferences;
import android.util.Log;

import javax.inject.Inject;

import vivek.wo.lifecyclemvp.data.TaskRepository;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */

public class DetailFragmentPresenter implements DetailFragmentContact.Presenter {
    private static final String TAG = "DetailFragmentPresenter";
    TaskRepository mTaskRepository;
    SharedPreferences mSharedPreferences;

    @Inject
    DetailFragmentPresenter(TaskRepository taskRepository, SharedPreferences sharedPreferences) {
        mTaskRepository = taskRepository;
        mSharedPreferences = sharedPreferences;
        Log.d(TAG, "DetailFragmentPresenter: " + mTaskRepository);
        Log.d(TAG, "DetailFragmentPresenter: " + mSharedPreferences);
    }

    @Override
    public void takeView(DetailFragmentContact.View view) {
        
    }

    @Override
    public void dropView() {

    }
}
