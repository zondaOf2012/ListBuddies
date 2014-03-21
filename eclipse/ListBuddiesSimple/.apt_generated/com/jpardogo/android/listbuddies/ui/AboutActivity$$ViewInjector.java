// Generated code from Butter Knife. Do not modify!
package com.jpardogo.android.listbuddies.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class AboutActivity$$ViewInjector {
  public static void inject(Finder finder, final com.jpardogo.android.listbuddies.ui.AboutActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131034153);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034153' for field 'mImageView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mImageView = (android.widget.ImageView) view;
    view = finder.findById(source, 2131034174);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034174' for field 'mTextView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTextView = (android.widget.TextView) view;
  }

  public static void reset(com.jpardogo.android.listbuddies.ui.AboutActivity target) {
    target.mImageView = null;
    target.mTextView = null;
  }
}
