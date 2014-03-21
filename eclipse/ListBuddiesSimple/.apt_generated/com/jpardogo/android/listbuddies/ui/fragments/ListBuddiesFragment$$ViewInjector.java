// Generated code from Butter Knife. Do not modify!
package com.jpardogo.android.listbuddies.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ListBuddiesFragment$$ViewInjector {
  public static void inject(Finder finder, final com.jpardogo.android.listbuddies.ui.fragments.ListBuddiesFragment target, Object source) {
    View view;
    view = finder.findById(source, 2131034190);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034190' for field 'mListBuddies' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mListBuddies = (com.jpardogo.listbuddies.lib.views.ListBuddiesLayout) view;
  }

  public static void reset(com.jpardogo.android.listbuddies.ui.fragments.ListBuddiesFragment target) {
    target.mListBuddies = null;
  }
}
