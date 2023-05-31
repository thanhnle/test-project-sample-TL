import katalon from "@katalon-studio/cloud-test";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://vingroup.net");
  await web.verifyElementExists({
    type: "Web",
    id: "7db2d0d7-d4c1-432b-be27-ce3ddbf3ecfc",
    attributes: {},
    childIndex: 2,
    hashes: { "md5.v1": "69c8229f62262e36c3caafb7addfd3dd" },
    name: "span - TIÊN PHONG",
    selectors: [
      {
        id: "6b588c9d-7c38-4f6e-9a8f-27f8b49bfcc3",
        type: "CSS",
        value: ".title span",
        isDefault: true,
      },
      {
        id: "fc4649be-b137-4b3c-b528-352fa733cd1c",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "span",
    text: "TIÊN PHONG",
    pageUrl: "https://vingroup.net/phat-trien-ben-vung",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.closeBrowser();
});