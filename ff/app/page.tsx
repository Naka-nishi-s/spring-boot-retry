"use client";

import styles from "./page.module.css";

export default function Home() {
  /** form送信 */
  const sendForm = async (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    const form = new FormData(e.currentTarget);

    // Jsonに変換
    const data = Object.fromEntries(form.entries());

    try {
      const response = await fetch("/api/register", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data),
      });
      if (!response.ok) {
        throw new Error("Error発生");
      }

      console.log("成功");
      const dat = await response.json();
      console.log(dat);
    } catch (e) {
      console.log("失敗");
      console.log(e);
    }
  };

  return (
    <main className={styles.main}>
      <div className={styles.description}>
        <form onSubmit={sendForm}>
          <label>
            名前
            <input type="text" name="name" />
          </label>
          <label>
            年齢
            <input type="number" name="age" />
          </label>
          <button type="submit">決定</button>
        </form>
      </div>
    </main>
  );
}
