package hr.zagreb.dinamo.testapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.widget.ViewUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;

import java.io.IOException;
import java.nio.charset.Charset;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "mainactivity";
    private Button button;
    private Button enableButton;

    @Override
    protected void onResume() {
        super.onResume();

// dialog setup
//        DialogFragment dialogFragment = new AppCompatDialogFragment() {
//            @Nullable
//            @Override
//            public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//
////                getDialog().getWindow().setContentView(R.layout.dialog_fragment_premium_popup);
//
//                getDialog().setCanceledOnTouchOutside(true);
//                getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                getDialog().getWindow().getAttributes().dimAmount = 0.4f;
//                getDialog().getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
//                getDialog().setOnCancelListener(new DialogInterface.OnCancelListener() {
//                    @Override
//                    public void onCancel(DialogInterface dialog) {
//                        Log.i(TAG, "onCancel: pressed");
//                    }
//                });
//                return super.onCreateView(inflater, container, savedInstanceState);
//            }
//
//            @NonNull
//            @Override
//            public Dialog onCreateDialog(Bundle savedInstanceState) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setView(R.layout.dialog_fragment_premium_popup);
//
//                return builder.create();
//            }
//        };
//        dialogFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.AppTheme);
//        dialogFragment.setCancelable(true);
//        dialogFragment.show(getSupportFragmentManager(), "PopUp");
    }

    public int convertDPtoPixel(int nDp) {
        int nPixel;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        nPixel = Math.round(nDp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return nPixel;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        button = (Button) findViewById(R.id.test_button);
//        enableButton = (Button) findViewById(R.id.activate_test_button);

/*        Log.i(TAG, "onCreate: button is selected " + button.isSelected());
        Log.i(TAG, "onCreate: button is activated " + button.isActivated());
        Log.i(TAG, "onCreate: button is enabled " + button.isEnabled());
        Log.i(TAG, "onCreate: button is clickable " + button.isClickable());
        Log.i(TAG, "onCreate: button is pressed " + button.isPressed());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                button.setEnabled(false);
                button.setActivated(false);
            }
        });

        enableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                button.setEnabled(true);
                button.setActivated(true);
            }
        });

        byte[] byteRy = new byte[]{1, 2, 3, 4, 5};
        int[] intRy = new int[byteRy.length];
        for (int i = 0; i < byteRy.length; i++) {
            intRy[i] = byteRy[i];
        }
        for (byte b : byteRy) {
            Log.i(TAG, "onCreate: " + b);
        }
        for (int b : intRy) {
            Log.i(TAG, "onCreate: " + b);
        }
    */

//        String test = "test";
//        String test = "74 65 73 74";
//
//        String[] testTrim = test.split(" ");
//        for (int i = 0; i < testTrim.length; i++) {
//            Log.i(TAG, "onCreate: " + (char) Integer.parseInt(testTrim[i], 16));
//        }
    }
}
