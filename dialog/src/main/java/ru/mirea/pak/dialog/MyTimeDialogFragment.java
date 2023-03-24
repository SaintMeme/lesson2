package ru.mirea.pak.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;


public class MyTimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    public interface TimePickerListner{
        void onTimeSet(TimePicker timePicker, int hour, int minute);
    }

    TimePickerListner mListner;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            mListner= (TimePickerListner) context;
        } catch (Exception e) {
            throw new ClassCastException(getActivity().toString()+" must implements TimePickerListner");
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar cal = Calendar.getInstance();
        int hour=cal.get(Calendar.HOUR);
        int minute=cal.get(Calendar.MINUTE);
        return new TimePickerDialog(getActivity(), this,hour,minute, DateFormat.is24HourFormat(getContext()));
    }

    @Override
    public  void onTimeSet(TimePicker timePicker, int i, int il) {
        mListner.onTimeSet(timePicker, i, il);
    }
}