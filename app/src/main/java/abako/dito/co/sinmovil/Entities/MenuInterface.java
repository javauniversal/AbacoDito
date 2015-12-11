package abako.dito.co.sinmovil.Entities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import abako.dito.co.sinmovil.R;

public class MenuInterface extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView modulo;
    public TextView descripcion;
    public TextView presio;
    public TextView usuario;

    public MenuInterface(View itemView, Context context) {
        super(itemView);


        this.modulo = (TextView) itemView.findViewById(R.id.txtNombreModulo);
        this.descripcion = (TextView) itemView.findViewById(R.id.txtDescripcion);
        this.presio = (TextView) itemView.findViewById(R.id.txtValor);
        this.usuario = (TextView) itemView.findViewById(R.id.txtUsuario);

        this.imageView = (ImageView) itemView.findViewById(R.id.imgModule);

    }
}
