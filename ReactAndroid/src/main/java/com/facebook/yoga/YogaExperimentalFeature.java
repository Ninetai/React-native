/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

// @generated by enums.py

package com.facebook.yoga;

public enum YogaExperimentalFeature {
  WEB_FLEX_BASIS(0);

  private final int mIntValue;

  YogaExperimentalFeature(int intValue) {
    mIntValue = intValue;
  }

  public int intValue() {
    return mIntValue;
  }

  public static YogaExperimentalFeature fromInt(int value) {
    switch (value) {
      case 0: return WEB_FLEX_BASIS;
      default: throw new IllegalArgumentException("Unknown enum value: " + value);
    }
  }
}
