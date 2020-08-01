package com.squareup.contour.sample

import android.content.Context
import android.util.AttributeSet
import com.squareup.contour.ContourLayout

class LintBugSampleView(context: Context) : ContourLayout(context) {
  private val view = AnotherContourView(context).apply {
    layoutBy(x = matchParentX(), y = matchParentY())
  }
}

class AnotherContourView(context: Context) : ContourLayout(context)