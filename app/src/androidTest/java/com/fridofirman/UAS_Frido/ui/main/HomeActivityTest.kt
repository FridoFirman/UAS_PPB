package com.fridofirman.UAS_Frido.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.fridofirman.UAS_Frido.R
import com.fridofirman.UAS_Frido.utils.DataDummy
import com.fridofirman.UAS_Frido.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Test

class HomeActivityTest {

    private val dummyMovie = DataDummy.generateDummyMovies()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    @Before
    fun setUp() {
        ActivityScenario.launch(HomeActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResource)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResource)
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_detail_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_title)).check(matches(withText("Kapten Amerika: Avenger Pertama")))
        onView(withId(R.id.tv_detail_categories)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_categories)).check(matches(withText("Action, Adventure, Science Fiction")))
        onView(withId(R.id.tv_detail_release)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_description)).check(matches(withText("Seorang pemuda sakit-sakitan yang berusaha untuk mendaftarkan diri di Angkatan Darat Amerika Serikat pada tahun 1943 untuk melawan Nazi, tetapi dianggap tidak layak secara fisik. Kemudian dia justru menawarkan diri untuk menjadi relawan dalam sebuah proyek yang disebut Rebirth, sebuah operasi militer rahasia untuk membantu upaya perang Amerika Serikat yang menggunakan serum tertentu untuk mengubah Steve Rogers ke puncak kesempurnaan manusia dan menjadi tentara super.")))
    }

    @Test
    fun loadTvShows() {
        onView(withId(R.id.navigation_tv_show)).perform(click())
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withId(R.id.navigation_tv_show)).perform(click())
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_detail_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_title)).check(matches(withText("The Falcon and the Winter Soldier")))
        onView(withId(R.id.tv_detail_categories)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_categories)).check(matches(withText("Action, Adventure, Sci-Fi, Fantasy")))
        onView(withId(R.id.tv_detail_release)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_description)).check(matches(withText("Following the events of “Avengers: Endgame”, the Falcon, " +
                "Sam Wilson and the Winter Soldier, " +
                "Bucky Barnes team up in a global adventure that tests their " +
                "abilities, and their patience.")))
    }

    @Test
    fun loadFavoriteMovie(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.fab)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.navigation_favorite)).perform(click())
        onView(withId(R.id.rv_fav_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_fav_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadFavoriteTvShow(){
        onView(withId(R.id.navigation_tv_show)).perform(click())
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.fab)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.navigation_favorite)).perform(click())
        onView(withText("Favorite TV Show")).perform(click())
        onView(withId(R.id.rv_fav_tv_show)).check(matches(isDisplayed()))
    }

}