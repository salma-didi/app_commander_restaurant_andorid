// Generated by view binder compiler. Do not edit!
package com.example.shoppingcart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shoppingcart.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView item1;

  @NonNull
  public final CardView item2;

  @NonNull
  public final CardView item3;

  @NonNull
  public final CardView item4;

  @NonNull
  public final GridLayout mainGrid;

  @NonNull
  public final TextView textView;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull CardView item1,
      @NonNull CardView item2, @NonNull CardView item3, @NonNull CardView item4,
      @NonNull GridLayout mainGrid, @NonNull TextView textView, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.item1 = item1;
    this.item2 = item2;
    this.item3 = item3;
    this.item4 = item4;
    this.mainGrid = mainGrid;
    this.textView = textView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item1;
      CardView item1 = ViewBindings.findChildViewById(rootView, id);
      if (item1 == null) {
        break missingId;
      }

      id = R.id.item2;
      CardView item2 = ViewBindings.findChildViewById(rootView, id);
      if (item2 == null) {
        break missingId;
      }

      id = R.id.item3;
      CardView item3 = ViewBindings.findChildViewById(rootView, id);
      if (item3 == null) {
        break missingId;
      }

      id = R.id.item4;
      CardView item4 = ViewBindings.findChildViewById(rootView, id);
      if (item4 == null) {
        break missingId;
      }

      id = R.id.mainGrid;
      GridLayout mainGrid = ViewBindings.findChildViewById(rootView, id);
      if (mainGrid == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, item1, item2, item3, item4, mainGrid,
          textView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
