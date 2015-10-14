package com.mycompany.mylibs.Activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.Drawer.OnDrawerItemClickListener;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileSettingDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.mycompany.mylibs.R;


public class Main extends ActionBarActivity {

    private Toolbar toolbar;
    private Drawer Navigation;
    private AccountHeader header;
    private String Titulos = "Titulos";
    private String Volumes = "Volumes";
    private String Categorias = "Categorias";
    private String Emprestimos = "Emprestimos";
    PrimaryDrawerItem item1 = new PrimaryDrawerItem().withName(Volumes);
    SecondaryDrawerItem item2 = new SecondaryDrawerItem().withName(Titulos);
    SecondaryDrawerItem item3 = new SecondaryDrawerItem().withName(Categorias);
    private int mPositionClicked;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toolbar =( Toolbar ) findViewById( R.id.app_bar );
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar( ).setTitle("My Libs");
        getSupportActionBar().setElevation(2);

        //ACCOUNT HEADER
        header = new AccountHeaderBuilder()
                .withActivity(this)
                .withCompactStyle(false)
                .withSavedInstance(savedInstanceState)
                .withThreeSmallProfileImages(false)
                .withHeaderBackground(R.drawable.wallpaper1)
                .addProfiles(
                        new ProfileDrawerItem().withName("Patricio Bruno").withEmail("pbrunorb@hotmail.com").withIcon(getResources().getDrawable(R.drawable.perfil_principal))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {

                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean current) {
                        Toast.makeText(Main.this, "onProfileChanged: " + profile.getName(), Toast.LENGTH_SHORT).show();
                        return false;
                    }
                })
                .build();

        //NAVIGATION DRAWER
        Navigation = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggleAnimated(true)
                .withDrawerGravity(Gravity.LEFT)
                .withActionBarDrawerToggle(true)
                .withAccountHeader(header)
                .withSavedInstance(savedInstanceState)
                .withSelectedItem(0)
                .withOnDrawerItemClickListener(new OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick( View view, int position, IDrawerItem drawerItem ) {
                        for (int count = 0, tam = Navigation.getDrawerItems().size(); count < tam; count++) {
                            if (count == mPositionClicked && mPositionClicked <= 3) {
                                PrimaryDrawerItem aux = (PrimaryDrawerItem) Navigation.getDrawerItems().get(count);
                                aux.withIcon(getResources().getDrawable(getCorrectDrawerIcon(count, false)));
                                break;
                            }
                        }
                        if ( position <= 3) {
                            ((PrimaryDrawerItem) drawerItem ).withIcon(getResources().getDrawable(getCorrectDrawerIcon( position, true )));
                        }
                        mPositionClicked = 1;
                        Navigation.getAdapter().notifyDataSetChanged();
                        return false;
                    }

                })
                .withOnDrawerItemLongClickListener(new Drawer.OnDrawerItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(View view, int position, IDrawerItem drawerItem) {
                        return false;
                    }
                })
                .build();
        Navigation.addItem(new PrimaryDrawerItem().withName("Titulos").withIcon(getResources().getDrawable(R.drawable.volumes)));
        Navigation.addItem(new PrimaryDrawerItem().withName("Volumes").withIcon(getResources().getDrawable(R.drawable.titulos)));
        Navigation.addItem(new PrimaryDrawerItem().withName("Categorias").withIcon(getResources().getDrawable(R.drawable.categorias)));
        Navigation.addItem(new PrimaryDrawerItem().withName("Emprestimos").withIcon(getResources().getDrawable(R.drawable.emprestimo)));
        Navigation.addItem( new SectionDrawerItem().withName("Configurações"));
        Navigation.addItem( new ProfileSettingDrawerItem().withName("Perfil").withIcon(getResources().getDrawable(R.drawable.perfil)));
        Navigation.addItem(new SecondaryDrawerItem().withName("Configurações").withIcon(getResources().getDrawable(R.drawable.settings)));

    }

    private int getCorrectDrawerIcon( int position , boolean isSelected){
        switch ( position ){
            case 0:
                return ( isSelected ? R.drawable.volumes_selected : R.drawable.volumes);
            case 1:
                return ( isSelected ? R.drawable.titulos_selected : R.drawable.titulos);
            case 2:
                return ( isSelected ? R.drawable.categorias_selected : R.drawable.categorias);
            case 3:
                return ( isSelected ? R.drawable.emprestimo_selected : R.drawable.emprestimo);
        }
        return (0);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
