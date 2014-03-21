// Generated code from Butter Knife. Do not modify!
package com.jpardogo.android.listbuddies.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class CustomizeFragment$$ViewInjector {
  public static void inject(Finder finder, final com.jpardogo.android.listbuddies.ui.fragments.CustomizeFragment target, Object source) {
    View view;
    view = finder.findById(source, 2131034189);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034189' for field 'mManualScrollSpinner' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mManualScrollSpinner = (android.widget.Spinner) view;
    view = finder.findById(source, 2131034182);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034182' for field 'seekBarSpeedValue' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.seekBarSpeedValue = (android.widget.TextView) view;
    view = finder.findById(source, 2131034187);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034187' for field 'mDividerSpinner' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mDividerSpinner = (android.widget.Spinner) view;
    view = finder.findById(source, 2131034185);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034185' for field 'seekBarDivHeightValue' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.seekBarDivHeightValue = (android.widget.TextView) view;
    view = finder.findById(source, 2131034184);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034184' for field 'mSeekBarDivHeight' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mSeekBarDivHeight = (android.widget.SeekBar) view;
    view = finder.findById(source, 2131034178);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034178' for field 'mSeekBarGap' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mSeekBarGap = (android.widget.SeekBar) view;
    view = finder.findById(source, 2131034186);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034186' for field 'mFillGapSpinner' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mFillGapSpinner = (android.widget.Spinner) view;
    view = finder.findById(source, 2131034188);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034188' for field 'mAutoScrollSpinner' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mAutoScrollSpinner = (android.widget.Spinner) view;
    view = finder.findById(source, 2131034179);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034179' for field 'seekBarGapValue' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.seekBarGapValue = (android.widget.TextView) view;
    view = finder.findById(source, 2131034181);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034181' for field 'mSeekBarSpeed' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mSeekBarSpeed = (android.widget.SeekBar) view;
  }

  public static void reset(com.jpardogo.android.listbuddies.ui.fragments.CustomizeFragment target) {
    target.mManualScrollSpinner = null;
    target.seekBarSpeedValue = null;
    target.mDividerSpinner = null;
    target.seekBarDivHeightValue = null;
    target.mSeekBarDivHeight = null;
    target.mSeekBarGap = null;
    target.mFillGapSpinner = null;
    target.mAutoScrollSpinner = null;
    target.seekBarGapValue = null;
    target.mSeekBarSpeed = null;
  }
}
