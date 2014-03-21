// Generated code from Butter Knife. Do not modify!
package com.jpardogo.android.listbuddies.adapters;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class CustomizeSpinnersAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.jpardogo.android.listbuddies.adapters.CustomizeSpinnersAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findById(source, 2131034157);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034157' for field 'title' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.title = (android.widget.TextView) view;
    view = finder.findById(source, 2131034194);
    target.subtitle = (android.widget.TextView) view;
  }

  public static void reset(com.jpardogo.android.listbuddies.adapters.CustomizeSpinnersAdapter.ViewHolder target) {
    target.title = null;
    target.subtitle = null;
  }
}
