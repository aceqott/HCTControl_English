package com.hctrom.romcontrol;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.hctrom.romcontrol.prefs.ThemeSwitch;

/*      Created by Roberto Mariani and Anna Berkovitch, 08/06/15
This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU General Public License as published by
        the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU General Public License for more details.

        You should have received a copy of the GNU General Public License
        along with this program.  If not, see <http://www.gnu.org/licenses/>.*/
public class ThemeSelectorUtility {

    Context c;

    public ThemeSelectorUtility(Context context){
        this.c = context;
    }



    /**
     * Set the theme of the activity, according to the configuration.
     */
    public  void onActivityCreateSetTheme(Activity activity) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(c);
        int themeId = prefs.getInt("theme_prefs", 0);

        switch (themeId) {
            default:
            case 0:
                activity.setTheme(R.style.AppThemeHCT);
                ThemeSwitch.getIconsColor(c);
                break;
            case 1:
                activity.setTheme(R.style.AppTheme);
                ThemeSwitch.getIconsColor(c);
                break;
            case 2:
                activity.setTheme(R.style.AppThemeLight);
                ThemeSwitch.getIconsColor(c);
                break;
            case 3:
                activity.setTheme(R.style.AppThemeSamsungLight);
                ThemeSwitch.getIconsColor(c);
                break;
            case 4:
                activity.setTheme(R.style.AppThemeMaterialDark);
                ThemeSwitch.getIconsColor(c);
                break;

        }
    }
}
