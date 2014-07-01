package com.outsystems.android.core.parsing;

import android.os.AsyncTask;

public abstract class GenericResponseParsingTask extends AsyncTask<Object, Void, Object> implements ParsingTaskMethods {

    public abstract Object parsingMethod();

    public abstract void parsingFinishMethod(Object result);

    @Override
    protected Object doInBackground(Object... params) {
        return parsingMethod();
    }

    @Override
    protected void onPostExecute(Object objects) {
        parsingFinishMethod(objects);
    }
}
