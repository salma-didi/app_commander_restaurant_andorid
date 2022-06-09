package com.example.shoppingcart.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.shoppingcart.models.Product;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Salade de fruit de mer", 40,  "12:00",
                "La salade de fruits de mer, l’insalata di mare, un immense classique italien presque une icône que l’on déguste les jours spéciaux (même à Noël), dans les restaurants notamment près de la mer, des trattorie, parfois même au marché dans le Sud et bien sûr l’été.", "https://firebasestorage.googleapis.com/v0/b/food-app-flutter-55d35.appspot.com/o/salade%20de%20la%20mer.jpg?alt=media&token=08210ee0-9ded-4463-800d-80d295f33877"));
        productList.add(new Product(UUID.randomUUID().toString(), "Salade de cocombre", 20,  "12:00",
                "La salade de concombres au yaourt, une recette grecque \"fraîcheur\", parfaite pour les beaux jours ! Rafraîchissante et healthy, elle est peu calorique (mission maillot de bain oblige !), mais très gourmande : des concombres, du yaourt grec, une gousse d'ail, du jus de citron, de l'aneth... Votre meilleure alliée pour vous régaler, tout en restant raisonnable ! La vie est belle non ? À tester sans tarder, vous serez emballés !", "https://firebasestorage.googleapis.com/v0/b/food-app-flutter-55d35.appspot.com/o/salade%20de%20concombre%20au%20ch%C3%A8vre%20et%20olives.webp?alt=media&token=625471c9-ce28-42f0-8856-152023ad2396"));
        productList.add(new Product(UUID.randomUUID().toString(), "Tomates à la crème", 20,  "12:00",
                "Dans un saladier mélanger la moutarde, le sel, le poivre, la crème fraîche et le filet d’huile d’olive. Ajouter les tomates coupées en petits quartiers.Bien mélanger corriger l’assaisonnement et parsemer de ciboulette hachée.Laisser reposer 1 heures au réfrigérateur.", "https://firebasestorage.googleapis.com/v0/b/food-app-flutter-55d35.appspot.com/o/tomates%20cr%C3%A8me%20fraiche.jpg?alt=media&token=f99da238-d290-4c29-8b07-867616fea0d2"));
        productList.add(new Product(UUID.randomUUID().toString(), "Crevette en salade", 30,  "12:00",
                " la salade d'avocat et de crevettes roses ! Un régal plein de fraîcheur et de saveurs, qui fait toujours son petit effet en entrée d'un bon repas d'été. Et en prime, une recette d'assaisonnement à tomber, hyper goûteuse et carrément divine. Alors testez vite cette recette de salade de crevettes et avocat super fraîche, vous allez vous régaler, et vos invités aussi. Bon appétit !", "https://firebasestorage.googleapis.com/v0/b/food-app-flutter-55d35.appspot.com/o/coupelles-de-crevettes-en-salade.jpeg?alt=media&token=be7c20c4-4cca-499f-a674-1692af2bc90d"));
        productList.add(new Product(UUID.randomUUID().toString(), "Salade exotique", 20,  "12:00",
                "En attendant de pouvoir déguster de bons fruits cet été, profitons des fruits exotiques cet hiver afin de faire le plein en vitamines.", "https://firebasestorage.googleapis.com/v0/b/food-app-flutter-55d35.appspot.com/o/salade%20exotique.jpg?alt=media&token=fee29cd9-37ba-4eb4-bbb9-3370ccc31c27"));
        productList.add(new Product(UUID.randomUUID().toString(), "Steak", 40,  "12:00", "Incontournable pour les amateurs de viande de bœuf, le steak est une valeur sûre qui s’apprécie aussi bien avec une sauce au poivre, au roquefort, à l’échalote, au vin, béarnaise, ou tout simplement nature avec un peu de sel et de poivre.",
                "https://firebasestorage.googleapis.com/v0/b/food-app-d1325.appspot.com/o/macaron.jpg?alt=media&token=69ed7bb8-f3f2-426b-9dd2-7cfc9e92310a"));
        productList.add(new Product(UUID.randomUUID().toString(), "Pizza", 80,  "12:00",
                "Quoi de meilleur qu'une bonne pizza maison ? La pizza est un plat d'origine italienne fait d'une pâte à pain étalée et de coulis de tomate, recouverte de divers ingrédients comme poivrons, olives, anchois et cuite au four. Mais on l'apprécie aussi la toute simple et incontournable pizza margherita ! La pizza est un des mets de la cuisine italienne qui s'est établi presque partout dans le monde, souvent en s'adaptant aux goûts locaux.",
                "https://firebasestorage.googleapis.com/v0/b/food-app-d1325.appspot.com/o/pizza.jpg?alt=media&token=4bc8c2bc-69e6-48ad-90ee-82efbac86377"));
        productList.add(new Product(UUID.randomUUID().toString(), "Hamburger", 40,  "12:00",
                "Hamburger, cheeseburger, fishburger... ou plus simplement le burger, parti vers l'Amérique avec les migrants européens et revenu tel le saumon sur ses terres d'origine, n'est rien d'autre qu'un sandwich à la viande ou au poisson, garni de crudités et éventuellement de fromage.", "https://firebasestorage.googleapis.com/v0/b/food-app-flutter-55d35.appspot.com/o/hamburger.jpeg?alt=media&token=8bc10650-8c92-4cb0-93f5-b47076ca98d0"));

        mutableProductList.setValue(productList);
    }
}
