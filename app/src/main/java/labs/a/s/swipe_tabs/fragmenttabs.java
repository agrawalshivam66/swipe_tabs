package labs.a.s.swipe_tabs;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class fragmenttabs extends FragmentPagerAdapter {

    private Context mContext;

    public fragmenttabs(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new fragmentone();
        }
        else if(position==1) {
            return new fragmenttwo();

        }
        else{
            return new fragmentthree();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "ONE";
        } else if (position == 1) {
            return "TWO";
        } else  {
            return "THREE";
        }
    }
}

