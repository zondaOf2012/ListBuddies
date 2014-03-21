// Generated code from Butter Knife. Do not modify!
package com.jpardogo.android.listbuddies.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DetailActivity$$ViewInjector {
  public static void inject(Finder finder, final com.jpardogo.android.listbuddies.ui.DetailActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131034153);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034153' for field 'mImageView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mImageView = (android.widget.ImageView) view;
  }

  public static void reset(com.jpardogo.android.listbuddies.ui.DetailActivity target) {
    target.mImageView = null;
  }
}
