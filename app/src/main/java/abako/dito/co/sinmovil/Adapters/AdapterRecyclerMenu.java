package abako.dito.co.sinmovil.Adapters;


import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;

import abako.dito.co.sinmovil.Entities.EntMenu;
import abako.dito.co.sinmovil.Entities.MenuInterface;
import abako.dito.co.sinmovil.R;

import static abako.dito.co.sinmovil.Entities.EntMenu.getEntMenuStatic;

public class AdapterRecyclerMenu extends RecyclerView.Adapter<MenuInterface> {

    private Context context;
    private ImageLoader imageLoader1;
    private DisplayImageOptions options1;
    private ImageLoadingListener listener;

    public AdapterRecyclerMenu(Context context) {
        super();
        this.context = context;

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context).build();
        imageLoader1 = ImageLoader.getInstance();
        imageLoader1.init(config);

        //Setup options for ImageLoader so it will handle caching for us.
        options1 = new DisplayImageOptions.Builder()
                .cacheInMemory()
                .cacheOnDisc()
                .build();
    }

    @Override
    public MenuInterface onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_menu, parent, false);
        return new MenuInterface(v, context);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(MenuInterface holder, final int position) {



        EntMenu items = getEntMenuStatic().get(position);
        loadeImagenView(items, holder.imageView);
        holder.modulo.setText(items.getModulo());
        holder.descripcion.setText(items.getDescripcion());
        holder.usuario.setText(items.getUsuario());
        holder.presio.setText(items.getPresio());

    }

    @Override
    public int getItemCount() {
        if (getEntMenuStatic() == null) {
            return 0;
        } else {
            return getEntMenuStatic().size();
        }
    }

    public void loadeImagenView(EntMenu data, ImageView img){

        ImageLoadingListener listener = new ImageLoadingListener(){
            @Override
            public void onLoadingStarted(String arg0, View arg1) {
                // TODO Auto-generated method stub
                //Inicia metodo
                //holder.progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onLoadingCancelled(String arg0, View arg1) {
                // TODO Auto-generated method stub
                //Cancelar
                //holder.progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onLoadingComplete(String arg0, View arg1, Bitmap arg2) {
                //Completado
                //holder.progressBar.setVisibility(View.GONE);
            }
            @Override
            public void onLoadingFailed(String arg0, View arg1, FailReason arg2) {
                // TODO Auto-generated method stub
                //Error al cargar la imagen.
                //holder.progressBar.setVisibility(View.GONE);
            }
        };

        imageLoader1.displayImage(data.getImageView(), img, options1, listener);
    }
}
