// Generated by view binder compiler. Do not edit!
package com.example.segnmea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.segnmea.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDataBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView channelNameTextView;

  @NonNull
  public final LinearLayout clinometerButton;

  @NonNull
  public final LinearLayout compassButton;

  @NonNull
  public final TextView headingTextView;

  @NonNull
  public final TextView latTextView;

  @NonNull
  public final TextView lonTextView;

  @NonNull
  public final LinearLayout mainButton;

  @NonNull
  public final TextView pitchTextView;

  @NonNull
  public final TextView realTimeDataTextView;

  @NonNull
  public final TextView rollTextView;

  @NonNull
  public final TextView speedTextView;

  private ActivityDataBinding(@NonNull LinearLayout rootView, @NonNull TextView channelNameTextView,
      @NonNull LinearLayout clinometerButton, @NonNull LinearLayout compassButton,
      @NonNull TextView headingTextView, @NonNull TextView latTextView,
      @NonNull TextView lonTextView, @NonNull LinearLayout mainButton,
      @NonNull TextView pitchTextView, @NonNull TextView realTimeDataTextView,
      @NonNull TextView rollTextView, @NonNull TextView speedTextView) {
    this.rootView = rootView;
    this.channelNameTextView = channelNameTextView;
    this.clinometerButton = clinometerButton;
    this.compassButton = compassButton;
    this.headingTextView = headingTextView;
    this.latTextView = latTextView;
    this.lonTextView = lonTextView;
    this.mainButton = mainButton;
    this.pitchTextView = pitchTextView;
    this.realTimeDataTextView = realTimeDataTextView;
    this.rollTextView = rollTextView;
    this.speedTextView = speedTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_data, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.channelNameTextView;
      TextView channelNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (channelNameTextView == null) {
        break missingId;
      }

      id = R.id.clinometerButton;
      LinearLayout clinometerButton = ViewBindings.findChildViewById(rootView, id);
      if (clinometerButton == null) {
        break missingId;
      }

      id = R.id.compassButton;
      LinearLayout compassButton = ViewBindings.findChildViewById(rootView, id);
      if (compassButton == null) {
        break missingId;
      }

      id = R.id.headingTextView;
      TextView headingTextView = ViewBindings.findChildViewById(rootView, id);
      if (headingTextView == null) {
        break missingId;
      }

      id = R.id.latTextView;
      TextView latTextView = ViewBindings.findChildViewById(rootView, id);
      if (latTextView == null) {
        break missingId;
      }

      id = R.id.lonTextView;
      TextView lonTextView = ViewBindings.findChildViewById(rootView, id);
      if (lonTextView == null) {
        break missingId;
      }

      id = R.id.mainButton;
      LinearLayout mainButton = ViewBindings.findChildViewById(rootView, id);
      if (mainButton == null) {
        break missingId;
      }

      id = R.id.pitchTextView;
      TextView pitchTextView = ViewBindings.findChildViewById(rootView, id);
      if (pitchTextView == null) {
        break missingId;
      }

      id = R.id.realTimeDataTextView;
      TextView realTimeDataTextView = ViewBindings.findChildViewById(rootView, id);
      if (realTimeDataTextView == null) {
        break missingId;
      }

      id = R.id.rollTextView;
      TextView rollTextView = ViewBindings.findChildViewById(rootView, id);
      if (rollTextView == null) {
        break missingId;
      }

      id = R.id.speedTextView;
      TextView speedTextView = ViewBindings.findChildViewById(rootView, id);
      if (speedTextView == null) {
        break missingId;
      }

      return new ActivityDataBinding((LinearLayout) rootView, channelNameTextView, clinometerButton,
          compassButton, headingTextView, latTextView, lonTextView, mainButton, pitchTextView,
          realTimeDataTextView, rollTextView, speedTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
