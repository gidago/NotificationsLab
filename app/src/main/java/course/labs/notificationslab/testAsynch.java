package course.labs.notificationslab;

import android.os.AsyncTask;

import android.util.Log;

public class testAsynch extends AsyncTask<Void, Integer, String> {

private static final String TAG = "Lab-Notifications";

protected void onPreExecute (){
      //  Log.d("PreExceute", "On pre Exceute......");
        log("PreExceute          On pre Exceute......");

        }



    protected String doInBackground(Void...arg0) {
        //Log.d("DoINBackGround","On doInBackground...");
        log("DoINBackGround     On doInBackground...");
        for(int i=0; i<10; i++){
        Integer in = new Integer(i);
        publishProgress(i);
        }
        return "You are at PostExecute";
        }

    protected void onProgressUpdate(Integer...a){

        log("You are in progress update ...  + a[0]");
    }

    protected void onPostExecute(String result) {

        log("PostExecute    + result");
    }

    // Simplified log output method
    private void log(String msg) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i(TAG, msg);
    }


}
