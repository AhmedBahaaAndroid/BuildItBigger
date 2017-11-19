package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import com.example.ahmed.myapplication.backend.myApi
/**
 * Created by ahmed on 15/11/17.
 */

 class EndpointAsyncTask extends AsyncTask<Context, Void, String> {
   public static myApi myApiService = null;
    private Context context;

    @Override
    protected String doInBackground(Context... params) {
     /*   if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new
                    MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // ­ 10.0.2.2 is localhost's IP address in Android emulator
                    // ­ turn off compression when running against local devappserver
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override                         public void initialize(AbstractGoogleClientRequest<?>
                                                                                         abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            myApiService = builder.build();
        }

        context = params[0];


        try {
            return myApiService.tellJoke().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
        */
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
     /*  // / Create Intent to launch JokeFactory Activity
        Intent intent = new Intent(context, DisplayJokeActivity.class);
        // Put the string in the envelope
        intent.putExtra(DisplayJoke.JOKE_KEY,result);
        context.startActivity(intent);

        Toast.makeText(context, result, Toast.LENGTH_LONG).show();
        */
    }



}


