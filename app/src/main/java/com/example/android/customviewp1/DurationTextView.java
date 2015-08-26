package com.example.android.customviewp1;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Pashgan on 05.03.2015.
 */
public class DurationTextView extends TextView {
    private static final String TEMPLATE = "Duration: <strong>%s</strong>";
    private String template;

    public DurationTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray attributes = context.obtainStyledAttributes(attrs,
                R.styleable.TemplateTextView);
        template = attributes.getString(
                R.styleable.TemplateTextView_template);
        if (template == null || !template.contains("%s")) {
            template = "%s";
        }
        attributes.recycle();
    }


    /**
     * Updates the text of the view with the new duration, properly
     * formatted
     *
     * @param duration
     * The duration in seconds
     */
    public void setDuration(float duration) {
        int durationInMinutes = Math.round(duration / 60);
        int hours = durationInMinutes / 60;
        int minutes = durationInMinutes % 60;

        String hourText = "";
        String minuteText = "";

        if (hours > 0) {
            hourText = hours + (hours == 1 ? " hour " : " hours ");
        }
        if (minutes > 0) {
            minuteText = minutes + (minutes == 1 ? " minute" : " minutes");
        }
        if (hours == 0 && minutes == 0) {
            minuteText = "less than 1 minute";
        }

        String durationText = String.format(template, hourText + minuteText);
        setText(Html.fromHtml(durationText), TextView.BufferType.SPANNABLE);
    }

}
