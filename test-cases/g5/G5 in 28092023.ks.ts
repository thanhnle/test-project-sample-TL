import katalon from "@katalon-studio/cloud-test";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://www.amazon.com/");
  await web.verifyElementVisible({
    type: "Web",
    id: "be6623d8-df81-4bad-a622-06b954c65fae",
    attributes: {
      href: "/ref=nav_logo",
      id: "nav-logo-sprites",
      class: "nav-logo-link nav-progressive-attribute",
      "aria-label": "Amazon",
    },
    childIndex: 1,
    hashes: { "md5.v1": "b68917368eb6a64a62e38d9556b9a7d3" },
    name: "a - Amazon",
    selectors: [
      {
        id: "4a5a6679-17a5-43ed-ae4a-6f5adeb48e3f",
        type: "CSS",
        value: "#nav-logo-sprites",
        isDefault: true,
      },
      {
        id: "e52eaf40-8080-4547-8cad-75a8b191ac29",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "",
    pageUrl: "https://www.amazon.com/",
    parentIframe: null,
    shadowRoot: null,
  });
});