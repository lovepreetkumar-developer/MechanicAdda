package com.techfathers.mechanic_adda.ui.base;

import android.view.View;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

public interface BaseCallback {
    void onClick(View view);
    default void onViewClick(View view, int position){}
}
