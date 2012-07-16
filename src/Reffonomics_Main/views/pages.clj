(ns Reffonomics-Main.views.pages
  (:require [Reffonomics-Main.views.common :as template]
            [Reffonomics-Main.views.text :as text])
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]))

(defpage "/" []
  (render "/home"))

(defpage "/home" []
  (template/home
    [:div.row-fluid
      [:div.span12
        [:div.hero-unit
          [:h1 "Welcome to Reffonomics.com"]
          [:h2 "by Steven Reff and Dick Brunell"]
        ]]]
  ))

(defpage "/basic" []
  (template/basic
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Basic Concepts"]]]]
  ))

(defpage "/micro" []
  (template/micro
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Micro Economics"]]]]
  ))

(defpage "/macro" []
  (template/macro
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Macro Economics"]]]]
  ))

(defpage "/resources" []
  (template/resources
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Resources"]]]]
  ))

(defpage "/about" []
  (template/about
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "About the Authors"]
          [:br]
          [:div.row-fluid
            [:ul.thumbnails
              [:li.span4
                [:div.thumbnail
                  [:a {:href "/about/reff"}
                    (image {:class "about-img"} "/img/reff.jpg")
                    [:h5 "Steven Reff"]]
                  [:p "Dr. Reff teaches at the Unversity of Arizona."]]]
              [:li.span4
                [:div.thumbnail
                  [:a {:href "/about/brown"}
                    (image {:class "about-img"} "/img/brown.jpg")
                    [:h5 "Steven Brown"]]
                  [:p "Mr. Brown started a foundation."]]]
              [:li.span4
                [:div.thumbnail
                  [:a {:href "/about/brunell"}
                    (image {:class "about-img"} "/img/brunell.jpg")
                    [:h5 "Dick Brunell"]]
                  [:p "Dick Brunell is a man of the people for the people."]]]]]]]]))

(defpage "/about/reff" []
  (template/about-reff
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Steven Reff"]
          [:ul.breadcrumb
            [:li [:a {:href "/about"} "About"]
                [:span.divider "/"]]
            [:li [:a {:href "#"} "Steven Reff"]]]
          [:p (text/about-reff)]]]]))

(defpage "/about/brunell" []
  (template/about-brunell
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Dick Brunell"]
          [:ul.breadcrumb
            [:li [:a {:href "/about"} "About"]
                [:span.divider "/"]]
            [:li [:a {:href "#"} "Dick Brunell"]]]
          [:div (text/about-brunell)]]]]))
