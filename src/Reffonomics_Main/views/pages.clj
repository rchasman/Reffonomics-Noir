(ns Reffonomics-Main.views.pages
  (:require [Reffonomics-Main.views.common :as template]
            [Reffonomics-Main.views.text :as text]
            [Reffonomics-Main.views.nav :as nav])
  (:use [noir.core]
        [hiccup.core]
        [hiccup.page]
        [hiccup.element]))

(defpage "/" []
  (render "/home"))

(defpage "/home" []
  (template/home
    [:div.row-fluid
      [:div.span12
        [:div.hero-unit
          (image {:alt "Reffonomics.com"} "/img/logo.jpg")
          [:h1 "Welcome to Reffonomics"]
          [:br]
          [:h2 "by Steven Reff and Dick Brunelle"]
          [:br][:br]
          (link-to "/basic" [:button.btn.btn-primary.btn-large "Let's Get Started!"])
        ]]]
  ))

(defpartial flash-modal [swf text]
  [:br]
  [:a.btn.btn-primary {:data-toggle "modal" :href (str "#" swf "-modal")}
    (str text " &nbsp") [:i.icon-film]]
  [:div.modal.hide.fade.in {:id (str swf "-modal")}
    [:div.modal-header
      [:a.close {:data-dismiss "modal"} "x"]
      [:h3 text]]
    [:div.modal-body
      [:object
        [:param {:name swf :value (str "/res/" swf ".swf")}
          [:embed {:src (str "/res/" swf ".swf") :width "800px" :height "450px"}]]]]]
  (javascript-tag (str "$('" swf "-modal').modal();"))
  [:br])

(defpartial interactive-modal [swf text]
  [:br]
  [:a.btn.btn-info {:data-toggle "modal" :href (str "#" swf "-modal")}
    (str text " &nbsp") [:i.icon-wrench.icon-white]]
  [:div.modal.hide.fade.in {:id (str swf "-modal")}
    [:div.modal-header
      [:a.close {:data-dismiss "modal"} "x"]
      [:h3 text]]
    [:div.modal-body
      [:object
        [:param {:name swf :value (str "/res/" swf ".swf")}
          [:embed {:src (str "/res/" swf ".swf") :width "800px" :height "450px"}]]]]]
  (javascript-tag (str "$('" swf "-modal').modal();"))
  [:br])

(defpartial pdf-questions [pdf text]
  [:br]
  [:a.btn.btn-danger {:href (str "/res/pdf/" pdf ".pdf")}
    (str text " &nbsp") [:i.icon-book]]
  [:br])

(defpage "/basic" []
  (template/basic
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Basic Concepts"]
          [:br]
          [:div.accordion
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#1"}
                    [:h2 "Unit #1 Introduction to Economics"]]
                [:div#1.accordion-body.collapse.in
                  [:div.accordion-inner
                    [:br]
                    [:div.row-fluid
                      [:div.span6
                        [:h4 "1st Edition 2002"]
                          (flash-modal "whatiseconomics1" "What is Economics?")
                          (flash-modal "opportunitycost" "Opportunity Cost")
                          (flash-modal "resources" "Resources")
                          (flash-modal "fallacyofcompositionlesson" "Fallacies (Post Hoc and Composition)")
                          (interactive-modal "posthocfallacyofcomposition" "Post Hoc Fallacy and Fallacy of Composition")
                          (pdf-questions "FallacyWorksheet" "'Free' Response Questions")
                          (pdf-questions "FallacyFRQrubric" "'Free' Response Questions Rubric")
                      ]
                      [:div.span6
                        [:h4 "2nd Edition 2004-2009"]
                          (flash-modal "Scarcity22" "Scarcity")
                          (flash-modal "Opportunitycost22" "Opportunity Cost")
                          (flash-modal "Resources22" "Resources")
                          (flash-modal "economicsystemsbook2" "Economic Systems")
                          (flash-modal "terms" "Terms in Economics")]]
                      [:br]]]]]
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#2"}
                    [:h2 "Production-Possibilities Curve/Frontier Unit"]]
                [:div#2.accordion-body.collapse
                  [:div.accordion-inner "&ltcontent&gt" ]]]]
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#3"}
                    [:h2 "Circular Flow Unit"]]
                [:div#3.accordion-body.collapse
                  [:div.accordion-inner "&ltcontent&gt" ]]]]
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#4"}
                     [:h2 "Supply and Demand Unit"]]
                [:div#4.accordion-body.collapse
                  [:div.accordion-inner "&ltcontent&gt" ]]]]
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#5"}
                     [:h2 "Price Ceiling and Price Floor"]]
                [:div#5.accordion-body.collapse
                  [:div.accordion-inner "&ltcontent&gt" ]]]]

]]]]
  ))

(defpage "/micro" []
  (template/micro
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Micro Economics"]
          [:br]
          [:div.tabbable.tabs-left
            [:ul.nav.nav-tabs
              [:li.active
                [:a {:href "#tab1" :data-toggle "tab"} "Elasticity"]]
              [:li
                [:a {:href "#tab2" :data-toggle "tab"} "Marginal Analysis"]]
              [:li
                [:a {:href "#tab3" :data-toggle "tab"} "Utility"]]
              [:li
                [:a {:href "#tab4" :data-toggle "tab"} "Costs of Production"]]
              [:li
                [:a {:href "#tab5" :data-toggle "tab"} "Perfect Competition"]]
              [:li
                [:a {:href "#tab6" :data-toggle "tab"} "Monopoly"]]
              [:li
                [:a {:href "#tab7" :data-toggle "tab"} "Other Forms of Competition"]]
              [:li
                [:a {:href "#tab8" :data-toggle "tab"} "Competition Games"]]
              [:li
                [:a {:href "#tab9" :data-toggle "tab"} "Labor Market"]]
              [:li
                [:a {:href "#tab10" :data-toggle "tab"} "Economic Rent"]]
              [:li
                [:a {:href "#tab11" :data-toggle "tab"} "Externalities, Private vs. Public Goods"]]
              [:li
                [:a {:href "#tab12" :data-toggle "tab"} "Income Distribution"]]
              [:li
                [:a {:href "#tab13" :data-toggle "tab"} "Tariff Graph"]]
              [:li
                [:a {:href "#tab14" :data-toggle "tab"} "Investments"]]
              [:li
                [:a {:href "#tab15" :data-toggle "tab"} "Miscellanious"]]]
            [:div.tab-content
              [:div#tab1.tab-pane.active
                [:div.row-fluid
                  [:div.span6
                    [:h3 "2nd Edition 2006 - 2011"
                      [:br]
                      (flash-modal "null" "Elasticity of Demand, Part I")
                      (flash-modal "null" "Elasticity of Demand, Part II")
                      (flash-modal "null" "Elasticity of Demand, Part III")
                      (flash-modal "null" "Elasticity of Demand, Part IV")
                      (flash-modal "null" "Elasticity of Demand, Part V")
                      (pdf-questions "null" "Multiple Choice Questions")
                      (interactive-modal "null" "Per-Unit Tax Interactive, Part I")
                      (interactive-modal "null" "Per-Unit Tax Interactive, Part II")
                      (pdf-questions "null" "'Free' Repsonse Question 1")
                      (pdf-questions "null" "'Free' Repsonse Question 2")
                      (interactive-modal "null" "Royal Order of TANSTAAFL Induction")
                    ]]
                  [:div.span6
                    [:h3 "1st Edition 2002"
                      [:br][:br]
                      (flash-modal "null" "Elasticity")
                      [:br]
                      (flash-modal "null" "Elasticity and Excise Tax")
                    ]]]]
              [:div#tab2.tab-pane
                [:h3 "content2"]]
              [:div#tab3.tab-pane
                [:h3 "content3"]]
              [:div#tab4.tab-pane
                [:h3 "content4"]]
              [:div#tab5.tab-pane
                [:h3 "content5"]]
              [:div#tab6.tab-pane
                [:h3 "content6"]]
              [:div#tab7.tab-pane
                [:h3 "content7"]]
              [:div#tab8.tab-pane
                [:h3 "content8"]]
              [:div#tab9.tab-pane
                [:h3 "content9"]]
              [:div#tab10.tab-pane
                [:h3 "content10"]]
              [:div#tab11.tab-pane
                [:h3 "content11"]]
              [:div#tab12.tab-pane
                [:h3 "content12"]]
              [:div#tab13.tab-pane
                [:h3 "content13"]]
              [:div#tab14.tab-pane
                [:h3 "content14"]]
              [:div#tab15.tab-pane
                [:h3 "content15"]]]
]]]]
  ))

(defpage "/macro" []
  (template/macro
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Macro Economics"]]]]
  ))

(defpage "/resources" []
  (template/resources
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Resources"]]]]
  ))

(defpage "/about" []
  (template/about
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:div#about]]]]))

(defpage "/about/main" []
  (html5
    [:h1 "About the Authors"]
    [:br]
    [:div.row-fluid
      [:ul.thumbnails
        [:li.span4
          [:div.thumbnail
            [:a {:href "#Reff" :onClick "getAbout('reff')"}
              (image {:class "about-img"} "/img/reff.jpg")
              [:h5 "Steven Reff"]]
            [:p "Dr. Reff teaches at the Unversity of Arizona."]]]
        [:li.span4
          [:div.thumbnail
            [:a {:href "#Brown" :onClick "getAbout('brown')"}
              (image {:class "about-img"} "/img/brown.jpg")
              [:h5 "Thomas R. Brown"]]
            [:p "Mr. Brown started a foundation."]]]
        [:li.span4
          [:div.thumbnail
            [:a {:href "#Brunell" :onClick "getAbout('brunelle')"}
              (image {:class "about-img"} "/img/brunelle.jpg")
              [:h5 "Dick Brunelle"]]
            [:p "Dick Brunelle is a man of the people for the people."]]]]]))

(defpartial about-back-button []
    [:a {:href "#"}
      [:button.pull-left {:onClick "getAbout('main')"} "Back"]])

(defpage "/about/reff" []
  (html5
    [:h1 "Steven Reff"]
    (about-back-button)
    [:br]
    [:p (text/about-reff)]
    (about-back-button)))

(defpage "/about/brunell" []
  (html5
    [:h1 "Dick Brunelle"]
    (about-back-button)
    [:br]
    [:p (text/about-brunelle)]
    (about-back-button)))

(defpage "/about/brown" []
  (html5
    [:h1 "Thomas R. Brown"]
    (about-back-button)
    [:br]
    [:p (text/about-brunell)]
    (about-back-button)))

(defpage "/tests" []
  (template/tests
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1#tests "Test Center"]]]]))
