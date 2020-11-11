module.exports = {
  future: {
     removeDeprecatedGapUtilities: true,
     purgeLayersByDefault: true,
  },
  purge: ["./src/**/*.svelte"],
  theme: {
    extend: {
      height: theme => ({
        "36": "9rem",
        "66": "17.5rem",
      })
    },
  },
  variants: {},
  plugins: [],
}
