package mchehab.com.java;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public ViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
    }

    public void bindData(Model model){
        textView.setText(model.getText());
    }
}