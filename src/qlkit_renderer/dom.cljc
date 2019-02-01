(ns qlkit-renderer.dom)

(def valid-dom-elements
  #{:a
    :abbr
    :address
    :area
    :article
    :aside
    :audio
    :b
    :base
    :bdi
    :bdo
    :big
    :blockquote
    :body
    :br
    :button
    :canvas
    :caption
    :cite
    :code
    :col
    :colgroup
    :data
    :datalist
    :dd
    :del
    :details
    :dfn
    :dialog
    :div
    :dl
    :dt
    :em
    :embed
    :fieldset
    :figcaption
    :figure
    :footer
    :form
    :h1
    :h2
    :h3
    :h4
    :h5
    :h6
    :head
    :header
    :hr
    :html
    :i
    :iframe
    :img
    :input
    :ins
    :kbd
    :keygen
    :label
    :legend
    :li
    :link
    :main
    :map
    :mark
    :menu
    :menuitem
    :meta
    :meter
    :nav
    :noscript
    :object
    :ol
    :optgroup
    :option
    :output
    :p
    :param
    :picture
    :pre
    :progress
    :q
    :rp
    :rt
    :ruby
    :s
    :samp
    :script
    :section
    :select
    :small
    :source
    :span
    :strong
    :style
    :sub
    :summary
    :sup
    :table
    :tbody
    :td
    :tfoot
    :th
    :thead
    :time
    :title
    :tr
    :track
    :u
    :ul
    :var
    :video
    :wbr
    :circle
    :clipPath
    :ellipse
    :g
    :line
    :mask
    :path
    :pattern
    :polyline
    :rect
    :svg
    :text
    :defs
    :linearGradient
    :polygon
    :radialGradient
    :stop
    :tspan
    :filter
    :feImage
    :feComposite})

(def style-attributes #{:align-content
                        :align-items
                        :align-self
                        :all
                        :animation
                        :animation-delay
                        :animation-direction
                        :animation-duration
                        :animation-fill-mode
                        :animation-iteration-count
                        :animation-name
                        :animation-play-state
                        :animation-timing-function
                        :backface-visibility
                        :background
                        :background-attachment
                        :background-blend-mode
                        :background-clip
                        :background-color
                        :background-image
                        :background-origin
                        :background-position
                        :background-repeat
                        :background-size
                        :border
                        :border-bottom
                        :border-bottom-color
                        :border-bottom-left-radius
                        :border-bottom-right-radius
                        :border-bottom-style
                        :border-bottom-width
                        :border-collapse
                        :border-color
                        :border-image
                        :border-image-outset
                        :border-image-repeat
                        :border-image-slice
                        :border-image-source
                        :border-image-width
                        :border-left
                        :border-left-color
                        :border-left-style
                        :border-left-width
                        :border-radius
                        :border-right
                        :border-right-color
                        :border-right-style
                        :border-right-width
                        :border-spacing
                        :border-style
                        :border-top
                        :border-top-color
                        :border-top-left-radius
                        :border-top-right-radius
                        :border-top-style
                        :border-top-width
                        :border-width
                        :bottom
                        :box-shadow
                        :box-sizing
                        :caption-side
                        :caret-color
                        :clear
                        :clip
                        :color
                        :column-count
                        :column-fill
                        :column-gap
                        :column-rule
                        :column-rule-color
                        :column-rule-style
                        :column-rule-width
                        :column-span
                        :column-width
                        :columns
                        :content
                        :counter-increment
                        :counter-reset
                        :cursor
                        :direction
                        :display
                        :empty-cells
                        :filter
                        :flex
                        :flex-basis
                        :flex-direction
                        :flex-flow
                        :flex-grow
                        :flex-shrink
                        :flex-wrap
                        :float
                        :font
                        :font-family
                        :font-kerning
                        :font-size
                        :font-size-adjust
                        :font-stretch
                        :font-style
                        :font-variant
                        :font-weight
                        :hanging-punctuation
                        :height
                        :justify-content
                        :left
                        :letter-spacing
                        :line-height
                        :list-style
                        :list-style-image
                        :list-style-position
                        :list-style-type
                        :margin
                        :margin-bottom
                        :margin-left
                        :margin-right
                        :margin-top
                        :max-height
                        :max-width
                        :min-height
                        :min-width
                        :object-fit
                        :opacity
                        :order
                        :outline
                        :outline-color
                        :outline-offset
                        :outline-style
                        :outline-width
                        :overflow
                        :overflow-x
                        :overflow-y
                        :padding
                        :padding-bottom
                        :padding-left
                        :padding-right
                        :padding-top
                        :page-break-after
                        :page-break-before
                        :page-break-inside
                        :perspective
                        :perspective-origin
                        :position
                        :quotes
                        :resize
                        :right
                        :tab-size
                        :table-layout
                        :text-align
                        :text-align-last
                        :text-decoration
                        :text-decoration-color
                        :text-decoration-line
                        :text-decoration-style
                        :text-indent
                        :text-justify
                        :text-overflow
                        :text-shadow
                        :text-transform
                        :touch-action
                        :top
                        :transform
                        :transform-origin
                        :transform-style
                        :transition
                        :transition-delay
                        :transition-duration
                        :transition-property
                        :transition-timing-function
                        :unicode-bidi
                        :user-select
                        :vertical-align
                        :visibility
                        :white-space
                        :width
                        :word-break
                        :word-spacing
                        :word-wrap
                        :z-index
                        :fill
                        :stroke
                        :stroke-width})
